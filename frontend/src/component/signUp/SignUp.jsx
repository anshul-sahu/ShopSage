import axios from 'axios';
import React, { useState } from 'react'
import { api } from '../api';

function SignUp() {
    let [formData, setFormData] = useState({
        firstName : "",
        lastName : "",
        email : "",
        password : "",
        phone : "",
        dateOfBirth : "",
        gender : "",
        role : ""
    })

    let onChangeHandler = (e) =>{
        let {name, value} = e.target;

        setFormData({
            ...formData,
            [name] : value
        })
    }

    let onSubmitHandler = (e) =>{
        e.preventDefault();
        console.log(formData);
        axios.post(`${api}/user/signup`, formData)
        .then((resp)=>{
            console.log(resp.data, '#####');
        }).catch(err =>{
            console.log(err);
        })
    }
  return (
    <div>
        <h1>SignUp Form</h1>
        <div>
          <form onSubmit={onSubmitHandler}>
            First Name <input type="text" name="firstName" value={formData.firstName} onChange={onChangeHandler} /><br /><br />
            Last Name <input type="text" name="lastName" value={formData.lastName} onChange={onChangeHandler}  /><br /><br />
            Email <input type="text" name="email" value={formData.email} onChange={onChangeHandler} /><br /><br />
            Password <input type="password" name="password" value={formData.password} onChange={onChangeHandler} /><br /><br />
            Phone <input type="text" name="phone" value={formData.phone} onChange={onChangeHandler} /><br /><br />
            Date Of Birth <input type="date" name="dateOfBirth" value={formData.dateOfBirth} onChange={onChangeHandler} /><br /><br />
            Gender <select name="gender" value={formData.gender} onChange={onChangeHandler}>
                <option value="">Not Selected</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select> <br /><br />
            Role <select name="role" value={formData.role} onChange={onChangeHandler}>
                <option value="">Not Selected</option>
                <option value="Buyer">Buyer</option>
                <option value="Seller">Seller</option>
                <option value="Manufacturer">Manufacturer</option>
            </select> <br /><br />
            <input type="submit"  value="Submit" />
          </form>
        </div>
    </div>
  )
}

export default SignUp