import React, { Component } from 'react';
import EmployeeService from '../services/EmployeeService';

class ListEmployeeComponent extends Component {
    constructor(props){
        super(props)

        this.state = {
              employees: []
         }
    }
    componentDidMount(){
        EmployeeService.getEmployees().then((res) => {
        this.setState({ employees: res.data});
    });
}
    
    
    render() {
        return (
            <div>
                <h2 className='table table-striped table-bordered'></h2>
                <div className='rox'>
                    <table className='table table-striped table-bordered'>
                        <thead>
                            <tr>
                                <th>Employee F name</th>
                                <th>Employee L name</th>
                                <th>Employee Email</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            { 
                                this.state.employees.map(
                                    employee => 
                                    <tr key =  { employee.id }>
                                        <td>  {employee.firstName }</td>
                                        <td>  {employee.lastName }</td>
                                        <td>  {employee.emailId }</td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListEmployeeComponent;
