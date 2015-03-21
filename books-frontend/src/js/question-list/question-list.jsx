import React from 'react';

import QuestionListItem from './question-list-item.jsx!'

export default React.createClass({
  render: function () {
    var listItems = this.props.questions.map(function (question, id) {
      return <QuestionListItem key={id}>{question}</QuestionListItem>;
    });

    return (
      <ul>
        {listItems}
      </ul>
    );
  }
});
