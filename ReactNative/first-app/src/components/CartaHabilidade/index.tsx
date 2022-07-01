import React from 'react';
import { TouchableOpacity, View, Image, Text, TouchableOpacityProps, ImageProps } from 'react-native';
import { SkillData } from '../../screens/skills';
import { styles } from '../CartaHabilidade/styles';
import SkillCircle from "../../assets/images/alan.jpg";

interface CartaHabilidadeProps extends TouchableOpacityProps{
    habilidade: SkillData,
}



export const CartaHabilidade = ({habilidade, ...rest}: CartaHabilidadeProps)=>{
    return (
        <View>
            <TouchableOpacity style={styles.buttonSkill}>
                    <Image source={SkillCircle} style={styles.image} />
                    <Text style={styles.textSkill}>
                        {habilidade.name}
                    </Text>
                </TouchableOpacity>
        </View>
    )
}