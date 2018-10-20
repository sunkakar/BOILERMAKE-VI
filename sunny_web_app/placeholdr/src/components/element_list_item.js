import React, { Component } from 'react';
import '../App.css';
import UserData from '../data/FakeAPI.json';

class ElementListItem extends Component 
{
    render() 
    {
      return (
        <ul class="element-list-item">

          {UserData.map((user,index)=>{
            return ( 
            <li>
              <h2>{user.Type}</h2>
              <h5>{user.firstName} {user.lastName}</h5>
            </li>);      
          })}

        </ul>
      );
    }
}

export default ElementListItem;