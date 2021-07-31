import React from 'react';
import './App.css';
import Home from './components/Home';
import About from './components/About';
import {BrowserRouter as Router, Route,NavLink } from 'react-router-dom';


function App() {
  return (
    <Router>
    <div className="App">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav">

            <NavLink exact to="/" className="my-link">Home</NavLink>
            <NavLink exact to="/about" className="my-link">About</NavLink>
            
            
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
    </Router>
  );
}

export default App;