var gulp = require('gulp'),
    builder = require('systemjs-builder'),
    del = require('del');

gulp.task('clean', function (cb) {
  del('dist/', cb);
});

gulp.task('build', ['clean'], function () {
  builder.reset();

  return builder
      .loadConfig('./config.js')
      .then(function () {
        return builder.build('books/main.jsx!', 'dist/build.js')
      })
});

gulp.task('default', ['clean', 'build']);
gulp.watch('lib/**/*', ['build']);
