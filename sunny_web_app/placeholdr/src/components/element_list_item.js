import React, { Component } from 'react';
import '../App.css';
import UserData from '../data/FakeAPI.json';
import Home from '../home_icon.svg';

class ElementListItem extends Component 
{
    render() 
    {
      return (
        <div className="element-list-item">
          {
            UserData.map((user,index)=>{
            return ( 
              <li className="Inline" key={index}>
              <div ><img src={Home}/><h2>{user.Type}</h2><h5>{user.Address}</h5></div>
              <h4>${user.Rent}/month</h4>
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