import { useState } from "react";
import logo from "./logo.svg";
import "./App.css";
import Botao from "./components/Botao";

function App() {
  const [contador, setContador] = useState(0);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <button onClick={() => setContador(contador + 3)}>+ 3</button>
        <p>{contador}</p>
        <Botao nome="Alan"/>
      </header>
    </div>
  );
}

export default App;
