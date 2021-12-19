import './App.css';
import React from 'react';
import {BrowserRouter,Routes,Route,} from "react-router-dom";
import Login from './components/Login';
import Signup from './components/Signup';
import Experience from './components/Experience';
import Post from './components/Post';

function App() {
  return (
    <>
    <BrowserRouter>
           <Routes>
             <Route path = "/" element = {<Login/>}/>
             <Route path = "/signup" element = {<Signup/>}/>
             <Route path = "/experience" element = {<Experience/>}/>
             <Route path = "/post" element = {<Post/>}/>
           </Routes>
    </BrowserRouter>
    </>
  );
}

export default App;