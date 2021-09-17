import React, { createContext } from 'react';
import { Form } from './Components/Form';
import { List } from './Components/List';
import { StoreProvider } from './utils/StoreProvider';

export const HOST_API = "http://localhost:8080/api";
export const initialState = {
  todo: { list: [], item: {} }
};
export const Store = createContext(initialState)


function App() {
  return <StoreProvider>
    <h3>To-Do List</h3>
    <Form />
    <List />
  </StoreProvider>
}

export default App;
