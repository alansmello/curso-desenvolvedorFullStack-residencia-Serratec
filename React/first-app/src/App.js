
import "./App.css";
import Produto from "./components/Produto/index";
import {Home} from "./pages/Home";
const produtos = [{
  nome: "Teclado",
  descricao: "hjdashjahsdjhj",
  imagem: "https://images-ext-2.discordapp.net/external/sU5QDXXeQ8wywq0pMpkUT1MPfDxkTQ4Yoru7DuimQG0/https/www.glosarioit.com/GloImg/Teclado.webp",
  preco: "150,00",
  quantidade: "12"
},
{
  nome: "Monitor",
  descricao: "dsdddddddddddddd",
  imagem: "https://images-ext-2.discordapp.net/external/sU5QDXXeQ8wywq0pMpkUT1MPfDxkTQ4Yoru7DuimQG0/https/www.glosarioit.com/GloImg/Teclado.webp",
  preco: "250,00",
  quantidade: "8"
}]
/* {produtos.map((item) => {
  return <Produto nome={item.nome} descricao={item.descricao} imagem={item.imagem} preco={item.preco} quantidade={item.quantidade} />
})} */
function App() {
   
  return (
    <div>
      
      <Home/>


    </div>
   
  );
}

export default App;
