import axios from 'axios';
import { useEffect, useState } from 'react';
import ListaNomes from './components/ListaNomes';
import CriaNome from './components/CriaNome';
import './App.css';

function App() {

  const [nomes, setNomes] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api')
      .then(resp => setNomes(resp.data))
      .catch(erro => console.log(erro));
  }, [])
  

  return (
    <div className="App">
     
      <ListaNomes nomes={nomes} />
      <CriaNome nomes={nomes} fcAdicionaNome={setNomes} />
     
    </div>
  );
}

export default App;
