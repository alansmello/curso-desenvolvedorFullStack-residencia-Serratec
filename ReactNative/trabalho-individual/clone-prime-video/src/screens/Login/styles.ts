import { Platform, StyleSheet } from "react-native";


export const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#353535',
        alignItems: 'flex-start',
        
      },
    image: {
        width: 75, 
        height:75,
        marginTop:30,
        marginLeft:165
    },
    tittle:{
        color:'white',
        fontFamily: "sans-serif",
        fontSize: 30,
        marginLeft: 20,
    },
    link:{
        color:'#1D39A9',
        marginStart:280,
        fontWeight: 'bold',
        marginBottom:15
    },
    input: {
       
        backgroundColor:'#505050',
        color: '#fff',
        fontSize: 18,
        padding: Platform.OS === 'ios' ? 15 : 10,
        marginLeft:20,
        marginRight:10,
        marginTop: 2,
        borderRadius: 7,
        
    },
    inputTwo: {
       
        backgroundColor:'#505050',
        color: '#fff',
        borderWidth:1,
        borderColor:'#E57B1F',
        fontSize: 18,
        padding: Platform.OS === 'ios' ? 15 : 10,
        marginLeft:20,
        marginRight:10,
        marginTop: 2,
        borderRadius: 7,
        
    },
    checkSenha: {
        display:"flex",
        alignItems:'stretch',
        flexDirection: 'row', 
      },
    checkbox:{
        marginTop:25,
        marginLeft:20
    },
    senha:{
        color:'white',
        marginTop: 30,
        marginLeft: 10
    },
    button: {
        backgroundColor:'#E57B1F',
        padding: 15,
        borderRadius: 7,
        alignItems: 'center',
        marginTop: 40,
        marginLeft:15,
        marginRight:8
    },
    buttonText: {
        color: '#FFF',
        fontSize: 15,
        
    },
    condicitionsText:{
        color:'white',
        marginLeft:20,
        marginTop:20

    },

    newInAmazonText:{
        color:'#505050',
        marginTop:40
    },
    buttonTwo: {
        backgroundColor:'#454545',
        padding: 15,
        borderRadius: 7,
        alignItems: 'center',
        marginTop: 40,
        marginLeft:15,
        marginRight:8,
        borderWidth:1,
        borderColor:'#707070',
    },
    buttonTextTwo: {
        color: '#707070',
        fontSize: 15,

        
    },
    linkBotton:{
        marginTop:30,
        marginLeft:45
    },
    linkBottonTwo:{
        color:'#1D39A9',
        marginStart:280,
        fontWeight: 'bold',
        marginBottom:15,
        marginLeft:170
    },
    bottonText:{
        color:'#505050',
        fontSize:10,
        marginLeft:90,

    }
    
});