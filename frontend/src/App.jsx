import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import 'bootstrap-icons/font/bootstrap-icons.css';

import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from './component/navbar/Navbar';
import Home from './component/home/Home';
import SignIn from './component/signIn/SignIn';
import SignUp from './component/signUp/SignUp';
function App(){

  return (
    
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/signIn' element={<SignIn />} />
        <Route path='/signUp' element={<SignUp />} />

      </Routes>
    </BrowserRouter>
  )
};

export default App;