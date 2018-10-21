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
              <div className="element-list"><ElementList/></div>
              <div className="element-detail"><ElementDetail/></div>
          </div>
      );
    }
}

export default ElementContent;