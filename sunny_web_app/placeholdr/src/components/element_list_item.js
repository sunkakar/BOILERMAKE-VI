import React, { Component } from 'react';
import '../App.css';
import UserData from '../data/FakeAPI.json';

class ElementListItem extends Component 
{
    render() 
    {
      return (
        <div className="element-list-item">
          {
            UserData.map((user,index)=>{
            return ( 
              <li key={index}>
              <h2>{user.Type}</h2>
              <h4>$/month: {user.Rent}</h4>
              <h5>{user.Address}</h5>
              </li> 
              );      
            }
          )
          }
        </div>
      );
    }
}

export default ElementListItem;