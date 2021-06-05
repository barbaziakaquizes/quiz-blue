import React from 'react'
import ReactDOM from 'react-dom'
import {Route, Link, BrowserRouter as Router, Switch, Redirect} from 'react-router-dom'
import Welcome from './components/AdminHome/welcome'
import NotFound from './notFound'
import UsersQuizStatistic from "./components/AdminHome/usersQuizStatistic";
import AdminHomePage from "./components/QuizManager/adminHomePage";
import QuizEditor from "./components/QuizManager/quizEditor";

import UserQuizList from "./components/UserHome/UserQuizList";
import QuestionBlock from "./components/QuestionBlock";
import getCurrentHostName from "./util/getCurrentHostName";
import { Navbar, NavItem, Nav } from 'react-bootstrap';


const style = {
    position: 'absolute',
    top: 10,
    right: 10
}

const adminRouting = (
    <React.Fragment>
        <Router>
            {/*<Navbar bg="light" expand="lg">*/}
            {/*    <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>*/}
            {/*    <Navbar.Toggle aria-controls="basic-navbar-nav" />*/}
            {/*    <Navbar.Collapse id="basic-navbar-nav">*/}
            {/*        <Nav className="mr-auto">*/}
            {/*            <NavItem href="/">Home</NavItem>*/}
            {/*            <NavItem href="/admin">Quiz manager</NavItem>*/}
            {/*            <NavItem href="/admin/statistic">Statistic</NavItem>*/}
            {/*            <NavItem href="/user/home">User page</NavItem>*/}
            {/*        </Nav>*/}
            {/*    </Navbar.Collapse>*/}
            {/*</Navbar>*/}
            {/*<nav className="navbar navbar-expand-lg navbar-light bg-dark">*/}
            {/*    <div className="navbar-nav me-auto">*/}
            {/*        <Link className="nav-item" to="/">Home</Link>*/}
            {/*        <Link className="nav-item" to="/admin">Quiz manager</Link>*/}
            {/*        <Link className="nav-item" to="/admin/quiz-editor">Quiz manager</Link>*/}
            {/*        <Link className="nav-item" to="/admin/pass-quiz">Quiz manager</Link>*/}
            {/*    </div>*/}
            {/*</nav>*/}


            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <div className="container-fluid">
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="d-flex justify-content-between navbar-nav">
                            <li className="nav-item">
                                <a className="nav-link active fs-1" aria-current="page" href="/">Home</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active fs-1" href="/admin">Quiz manager</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active fs-1" href="/admin/statistic">Statistic</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active fs-1" href="/user/home" tabIndex="-1"
                                   aria-disabled="true">User page</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

                <Switch>
                    <Route exact path="/" component={Welcome} />
                    <Route exact path="/admin" component={AdminHomePage} />
                    <Route path="/admin/statistic" component={UsersQuizStatistic} />
                    <Route path="/admin/quiz-editor" component={QuizEditor} />
                    <Route path="/user/home" component={UserQuizList} />
                    <Route path="/user/pass-quiz" component={QuestionBlock} />

                    <Route component = {NotFound} />
                </Switch>
        </Router>
        <form>
            <button type="submit" formAction="/logout" style={style} className='btn btn-outline-secondary'>Logout</button>
        </form>
    </React.Fragment>
);

const userRouting = (
    <div className="quiz-list">
    <React.Fragment>
        <Router>
            <div>
                <Switch>
                    <Route exact path="/">
                        <Redirect to="/user/home" />
                    </Route>
                    <Route path="/user/home" component={UserQuizList} />
                    <Route path="/user/pass-quiz" component={QuestionBlock} />
                    <Route component = {NotFound} />
                </Switch>
            </div>
        </Router>
        <form>
            <button type="submit" formAction="/logout" style={style} className='btn btn-outline-secondary'>Logout</button>
        </form>
    </React.Fragment>
        </div>
);

    function getUserRole() {
        const currentHost = getCurrentHostName();
        let xhr = new XMLHttpRequest();
        xhr.open('GET', currentHost + "/api/user/role", false);
        xhr.send();
        return xhr.responseText;
    }


    document.body.style = 'background: #EEEEEE;';
    getUserRole().includes("ADMIN")
        ? ReactDOM.render(adminRouting, document.getElementById('root'))
        : ReactDOM.render(userRouting, document.getElementById('root'))

