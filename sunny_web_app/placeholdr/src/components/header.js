import React, { Component } from 'react';
import logo from '../logo.svg';
import '../App.css';

class Header extends Component 
{
    render() 
    {
      return (
          <div className="App-header">
            <img className="LOGO" src={logo} alt="lol.jpeg"/>
            <div className="Name">PlaceHoldr</div>
          </div>
      );
    }
}

export default Header;