import React, { Component } from 'react';
import './App.css';
import Header from './components/header.js';
import ElementContent from './components/element_content.js';

  class App extends Component {
    constructor(props)
    {
      super(props);
      this.state = { element_listing: [] };
    }
  render() {
    return (
        <div className="content-wrapper">
        <Header/>
        <ElementContent/>
        </div>
    );
  }
}

export default App;
