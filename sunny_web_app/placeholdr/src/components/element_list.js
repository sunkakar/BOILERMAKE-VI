import React, { Component } from 'react';
import '../App.css';
import ElementListItem from './element_list_item.js';


class ElementList extends Component 
{
    render() 
    {
      return (
            <div className="element-list-item">
              <ElementListItem/>
            </div>
      );
    }
}

export default ElementList;