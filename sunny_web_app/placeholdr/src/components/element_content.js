import React, { Component } from 'react';
import '../App.css';
import ElementList from './element_list.js';
import ElementDetail from './element_detail.js';
class ElementContent extends Component 
{
    render() 
    {
      return (
          <div className="element-content">
            <ElementList/><ElementDetail/>
          </div>
      );
    }
}

export default ElementContent;