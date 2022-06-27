import React, { useState } from 'react';
import { View, Image, Text, Linking, TextInput, Button, TouchableOpacity } from 'react-native';
import Amazon from '../../assets/images/amazon.png'; 
import { styles } from "./styles";

export const Login = ()=>{
    
  
    const[focus,setFocus] = useState(false);
    const customStyle = focus ? 'red' : 'black';
    

    return (
        <View>
            <View>
            <Image source={Amazon} style={styles.image} />
            </View>
            <Text style={styles.tittle}>Fazer Login</Text>
            <Text onPress={() => { 
      Linking.openURL('https://google.com'); 
    }} style={styles.link}>Esqueci a senha </Text>
        <TextInput
        placeholder = "Email ou numero de Telefone"
        placeholderTextColor="gray"
        style={styles.input}
        
        
        />
        <TextInput
        placeholder = "Senha Amazon"
        placeholderTextColor="gray"
        style={styles.input}
        />
        <Text style={styles.senha}>Mostrar senha</Text>
       
        <TouchableOpacity
            style={styles.button}
           // onPress={addSkillToList}
        >
            <Text style={styles.buttonText}>
                Fazer Login
            </Text>
        </TouchableOpacity>

        <Text style={styles.condicitionsText}>Ao continuar, você concorda com as
            <Text onPress={() => {Linking.openURL('https://www.amazon.com/gp/aw/help/ref=ap_mobile_signin_notification_condition_of_use?id=508088&ref_=d6k_applink_bb_dls&dplnkId=9e8728df-00d9-4171-a75d-6412c9abd293'); }} style={styles.link}> Condições de Uso </Text>
            e com a 
            <Text onPress={() => {Linking.openURL('https://google.com'); }} style={styles.link}> Política de Privacidade </Text>
            da Amazon.
        </Text>

        <Text style={styles.newInAmazonText}>_________________  É novo na Amazom ?  _________________</Text>
        </View>
    )
}