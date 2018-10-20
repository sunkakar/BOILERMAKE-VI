import React, { Component } from 'react';
import './App.css';
import Header from './components/header.js';
import ElementList from './components/element_list.js'; 
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
        <ElementList/>
        </div>
    );
  }
}

export default App;
