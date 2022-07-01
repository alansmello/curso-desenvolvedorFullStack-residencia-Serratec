import React, { useEffect, useState } from "react";
import { View, Text, Image, TouchableOpacity, TextInput, FlatList } from "react-native";
import { styles } from "./styles";

import SkillCircle from "../../assets/images/alan.jpg";
import { Botao } from "../../components/Botao";
import { CartaHabilidade } from "../../components/CartaHabilidade";

export interface SkillData {
    id: string,
    name: string,
}

export const Skills = () => {
    const [greetings, setGreetings] = useState<string>('');
    const [skill, setSkill] = useState<string>('');
    const [skillList, setSkillList] = useState<SkillData[]>([]);

    useEffect(() => {
        const currentHour = new Date().getHours();
        if (currentHour < 12) {
            setGreetings('GoodMorning');
        } else if (currentHour >= 12 && currentHour < 18) {
            setGreetings('Good Afternoon');
        } else {
            setGreetings('Good Evening');
        }
    }, []);

    function addSkillToList() {
        let newSkill: SkillData = {
            id: String(new Date().getTime()),
            name: skill,
        };
        setSkillList([...skillList, newSkill]);
        setSkill(skill);
    }


    return <View style={styles.container}>
        <Text style={styles.title}>
            {greetings}!
        </Text>
        fontFamily:'Arial Narrow',
        <TextInput
            style={styles.input}
            value={skill}
            onChangeText={(e) => setSkill(e)}
        />

        {/* <TouchableOpacity
            style={styles.button}
            onPress={addSkillToList}
        >
            <Text style={styles.buttonText}>
                Add
            </Text>
        </TouchableOpacity> */}
        
        <Botao title= 'Add' onPress={addSkillToList}
        activeOpacity={0.5}
        />

        <Text style={[styles.title, { marginVertical: 20 }]}>
            My skills
        </Text>

        <FlatList
            data={skillList}
            renderItem={({ item, index }) =>
                <CartaHabilidade habilidade={item}/>
            }
            keyExtractor={item => item.id}
        />

    </View>
}