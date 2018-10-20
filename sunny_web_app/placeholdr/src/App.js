import React, { Component } from 'react';
import './App.css';
import Header from './components/header.js';
import ElementList from './components/element_list.js';

  class App extends Component {
  render() {
    return (
        <div className="content-wrapper">
        <Header/>
        <ElementList/>
        </div>
    );
  }
}

export default App;
