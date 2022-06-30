import React, { useState } from 'react';
import { View, Image, Text, Linking, TextInput,TouchableOpacity } from 'react-native';
import Amazon from '../../assets/images/amazon.png'; 
import { Checkbox } from 'react-native-paper';
import { styles } from "./styles";

export const Login = ()=>{
    
  
    const [checked, setChecked] = React.useState(false);
    const[focusOne,setFocusOne] = useState(false);
    const[focusTwo,setFocusTwo] = useState(false);
    const customStyleOne = focusOne ? styles.inputTwo : styles.input;
    const customStyleTwo = focusTwo ? styles.inputTwo : styles.input;
    

    return (
        <View style={styles.container}>
        <View >
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
        onFocus={()=> setFocusOne(true)}
        style={customStyleOne}
        
        
        
        />
        <TextInput
        placeholder = "Senha Amazon"
        placeholderTextColor="gray"
        onFocus={()=> setFocusTwo(true)}
        style={customStyleTwo}

        />
        <View style={styles.checkSenha}>
            <View style={styles.checkbox}>
            <Checkbox
                color='white'
                
                uncheckedColor='white'
                status={checked ? 'checked' : 'unchecked'}
                onPress={() => {
                    setChecked(!checked);
                }}
                
            />
            </View>
            <Text style={styles.senha}>Mostrar senha</Text>
        </View>
        <TouchableOpacity
            style={styles.button}
            activeOpacity={0.9}
           // onPress={addSkillToList}
        >
            <Text style={styles.buttonText}>
                Fazer Login
            </Text>
        </TouchableOpacity>

        <Text style={styles.condicitionsText}>Ao continuar, você concorda com as
            <Text onPress={() => {Linking.openURL('https://www.amazon.com/gp/aw/help/ref=ap_mobile_signin_notification_condition_of_use?id=508088&ref_=d6k_applink_bb_dls&dplnkId=9e8728df-00d9-4171-a75d-6412c9abd293'); }} style={styles.link}> Condições de Uso </Text>
            e com a 
            <Text onPress={() => {Linking.openURL('https://www.amazon.com/gp/aw/help/ref=ap_mobile_signin_notification_privacy_notice?id=468496&dplnkId=bfa2b343-63a6-4a7f-b6ff-4e1e970cbc31'); }} style={styles.link}> Política de Privacidade </Text>
            da Amazon.
        </Text>

        <Text style={styles.newInAmazonText}>_________________  É novo na Amazom ?  _________________</Text>
        <TouchableOpacity
            style={styles.buttonTwo}
            // onPress={addSkillToList}
            >
            <Text style={styles.buttonTextTwo}>
                Criar uma nova conta Amazon
            </Text>
        </TouchableOpacity>
        <Text style = {styles.linkBotton}>
        <Text onPress={() => {Linking.openURL('https://www.amazon.com/gp/aw/help/ref=ap_mobile_signin_notification_condition_of_use?id=508088&ref_=d6k_applink_bb_dls&dplnkId=9e8728df-00d9-4171-a75d-6412c9abd293'); }} style={styles.link}> Condições de Uso    </Text>
        <Text onPress={() => {Linking.openURL('https://www.amazon.com/gp/aw/help/ref=ap_mobile_signin_notification_privacy_notice?id=468496&dplnkId=bfa2b343-63a6-4a7f-b6ff-4e1e970cbc31'); }} style={styles.link}>    Política de Privacidade </Text>
        </Text>
        <Text onPress={() => {Linking.openURL('https://www.amazon.com/gp/help/customer/display.html?dplnkId=da4a0bfa-76fa-41fc-935b-945ddf4b2029'); }} style={styles.linkBottonTwo}>Ajuda </Text>
        <Text style={styles.bottonText}>&copy; 2021-2022 Amazon.com, Inc. ou suas afiliadas</Text>
        </View>
        </View>

    )
}