import React from 'react';

function Produto(props){
    
    
    return <div>
        <h2>{props.nome}</h2>
        <p>{props.descricao}</p>
        <img src={props.imagem} alt = "teste"/>
        <h3>{props.preco}</h3>
        <h3>{props.quantidade}</h3>
        
    </div>
}

export default Produto;