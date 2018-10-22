import React, { Component } from 'react';
import '../App.css';
import ElementListItem from './element_list_item.js';


class ElementList extends Component 
{
    render() 
    {
      return (
              <ElementListItem/>
      );
    }
}

export default ElementList;