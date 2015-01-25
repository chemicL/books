import React from 'react';
import QuestionList from './question-list/question-list.jsx!';

var questions = [
  'Question 1',
  'Question 2',
  'Question 3',
  'Question 4'
];

React.render(
    <section>
      <h1>Most recent questions</h1>
      <QuestionList questions={questions} />
    </section>,
    document.getElementById('content')
);
