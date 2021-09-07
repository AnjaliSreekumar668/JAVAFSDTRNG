import React from 'react';
import './App.css';
import Home from './components/Home';
import About from './components/About';
import SpringBoot from './components/SpringBoot';
import MicroServices from './components/MicroServices';
import GCP from './components/GCP';
import Hibernate from './components/Hibernate';
import JavaBasics from './components/JavaBasics';
import Register from './components/Register';
import {BrowserRouter as Router, Route,NavLink } from 'react-router-dom';


function App() {
  return (
    <Router>
    <div className="App">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#" style={{color: "red"}} > Courses</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav">

            <NavLink exact to="/" className="my-link" style={{marginRight:"10px"}} >Home</NavLink>

            <NavLink exact to="/about" className="my-link" style={{marginRight:"10px"}}>About</NavLink>
            
            <NavLink exact to="/spring" className="my-link" style={{marginRight:"10px"}}>SpringBoot</NavLink>

            <NavLink exact to="/micro" className="my-link" style={{marginRight:"10px"}}>MicroServices</NavLink>

            <NavLink exact to="/gcp" className="my-link" style={{marginRight:"10px"}}>GCP</NavLink>

            <NavLink exact to="/hibernate" className="my-link" style={{marginRight:"10px"}}>Hibernate</NavLink>

            <NavLink exact to="/javabasics" className="my-link" style={{marginRight:"10px"}}>JavaBasics</NavLink>

            <NavLink exact to="/register" className="my-link" style={{marginRight:"10px"}}>Register</NavLink>

            <div class="dropdown">
    <button class="dropbtn">Contact Us 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Email</a>
      <a href="#">Contact No.</a>
      <a href="#">Address</a>
    </div>
  </div>
            
            
          </div>
        </div>
      </nav>
    </div>
    <Route exact path="/">
      <Home />
    </Route>
    <Route exact path="/about">
      <About />
    </Route>
    <Route exact path="/spring">
      <SpringBoot />
    </Route>
    <Route exact path="/micro">
      <MicroServices />
      </Route>
      <Route exact path="/gcp">
      <GCP />
    </Route>
    <Route exact path="/hibernate">
      <Hibernate />
    </Route>
    <Route exact path="/javabasics">
      <JavaBasics />
    </Route>
    <Route exact path="/register">
      <Register />
    </Route>
    </Router>
  );
}

export default App;