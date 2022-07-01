import React from 'react';
import { TouchableOpacity, View, Text, TouchableOpacityProps } from 'react-native';
import { styles } from './styles';

interface BotaoProps extends TouchableOpacityProps{
    title: string,
}

export const Botao = ({title, ...rest} : BotaoProps)=>{
    return(
        <View>
            <TouchableOpacity
            style={styles.button}
            {...rest}
            >
            <Text style={styles.buttonText}>
                {title}
            </Text>
        </TouchableOpacity>
        </View>
    )
}