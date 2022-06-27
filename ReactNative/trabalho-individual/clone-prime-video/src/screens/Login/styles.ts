import { Platform, StyleSheet } from "react-native";


export const styles = StyleSheet.create({
    image: {
        width: 75, 
        height:75,
        marginTop:30,
        marginLeft:165
    },
    tittle:{
        color:'white',
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
    checkbox: {
        width: 64,
        height: 64
      },
    senha:{
        color:'white',
        marginTop: 30,
        marginLeft: 80
    },
    button: {
        backgroundColor:'#E57B1F',
        padding: 15,
        borderRadius: 7,
        alignItems: 'center',
        marginTop: 40,
        marginLeft:15
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
    }
    
});