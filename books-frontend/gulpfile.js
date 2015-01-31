var builder = require('systemjs-builder'),
    del = require('del'),
    filter = require('gulp-filter'),
    gulp = require('gulp'),
    path = require('path'),
    rev = require('gulp-rev'),
    revNapkin = require('gulp-rev-napkin'),
    revReplace = require('gulp-rev-replace');

var paths = {
  source: {
    root: 'src',
    get js() { return 'books/main.jsx!'; },
    get html() { return path.join(paths.source.root, 'index.html'); }
  },
  build: {
    root: 'dist',
    get all() { return path.join(paths.build.root, '**/*'); },
    get js() { return path.join(paths.build.root, 'build.js'); }
  }
};

gulp.task('clean', function (cb) {
  del(paths.build.root, cb);
});

gulp.task('build:html', ['clean'], function () {
  return gulp.src(paths.source.html)
            .pipe(gulp.dest(paths.build.root));
});

gulp.task('build:js', ['clean'], function () {
  builder.reset();

  var jsFilter = filter('**/*.js');

  return builder
      .loadConfig('./jspm.config.js')
      .then(function () {
        return builder.build('books/main.jsx!', paths.build.js)
      })
      .then(function () {
            return gulp.src(paths.build.all)
                .pipe(jsFilter)
                .pipe(rev())
                .pipe(jsFilter.restore())
                .pipe(revReplace())
                .pipe(gulp.dest(paths.build.root))
                .pipe(revNapkin());
      });
});

gulp.task('build', ['build:js', 'build:html']);

gulp.task('watch', function () {
  gulp.watch(paths.js.all, ['build']);
});

gulp.task('default', ['clean', 'build']);
