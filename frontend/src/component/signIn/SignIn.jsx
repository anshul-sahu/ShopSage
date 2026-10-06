import axios from 'axios';
import React, { useState } from 'react'
import { api } from '../api';

function SignIn() {

  let [formData, setFormData] = useState({
    email: "",
    password: ""
  });

  let onChangeHandler = (e) => {
    let { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    })
  }
    let submitHandler = (e) => {
      e.preventDefault();
      console.log(formData)
      axios.post(`${api}/user/signin`, formData)
      .then((obj)=>{
        console.log(obj.data);
      }).catch(err =>{
        console.log(err);
      })
    }
  
  return (
    <div>
      <div>SignIn</div>

      <form onSubmit={submitHandler}>

        Email <input type="text" name="email" value={formData.email} onChange={onChangeHandler} /><br /><br />
        Password <input type="password" name="password" value={formData.password} onChange={onChangeHandler} /><br /><br />
        <input type="submit" value="Submit" />
      </form>
    </div>
  )
}

export default SignIn;