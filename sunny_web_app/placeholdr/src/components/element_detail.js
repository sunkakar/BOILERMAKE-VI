import React, { Component } from 'react';
import '../App.css';
import UserData from '../data/FakeAPI.json';

const Type = () => {
  if(UserData.Type==="House")
  {
    return '../img_folder/house.jpg'
  }
  if(UserData.Type==="Apartment")
  {
    return '../img_folder/apartment.jpg'
  }
  if(UserData.Type==="Closet")
  {
    return '../img_folder/closet.jpg'
  }
}
class ElementDetail extends Component 
{
    render() 
    {
      return (
            <div>
              <img src={Type}/>
            </div>
      );
    }
}

export default ElementDetail;