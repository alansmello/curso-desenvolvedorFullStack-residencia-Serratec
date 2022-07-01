import React from 'react';
import { View, Text, Image, TouchableOpacity, ScrollView } from 'react-native';
import { styles } from './styles';
import Professor from '../../assets/images/theProfessor.jpg';
import { Avatar } from 'react-native-paper';


export const Filme = ({navigation}) => {
    return (
        <View style={styles.container}>
            <ScrollView>
                <View>
                    <Image source={Professor} style={styles.image} />
                    <Text style={styles.tittleOne}>ADEUS,</Text>
                    <Text style={styles.tittleTwo}>PROFESSOR</Text>
                    <Text style={styles.primeText}>prime</Text>
                    <Text style={styles.primeTextTwo}>Incluído no Prime</Text>

                    <TouchableOpacity
                        style={styles.button}
                        activeOpacity={0.9}
                        onPress={()=> navigation.navigate("Login")}
                    >
                        <Avatar.Icon
                            size={50}
                            color={'white'}
                            style={styles.iconButton}
                            icon="play" />
                        <Text style={styles.buttonText}>
                            Assistir Agora
                        </Text>
                    </TouchableOpacity>
                    <View style={styles.icons}>
                        <Avatar.Icon
                            size={50}
                            color={'gray'}
                            style={styles.icon}
                            icon="play" />

                        <Avatar.Icon
                            size={50}
                            color={'gray'}
                            style={styles.icon}
                            icon="download" />
                        <Avatar.Icon
                            size={50}
                            color={'gray'}
                            style={styles.icon}
                            icon='plus' />
                        <Avatar.Icon
                            size={50}
                            color={'gray'}
                            style={styles.icon}
                            icon='plus' />
                    </View>
                    <View style={styles.icons}>
                        <Text style={styles.textIcons}>Trailer</Text>
                        <Text style={styles.textIcons}>Baixar</Text>
                        <Text style={styles.textIcons}>Lista</Text>
                        <Text style={styles.textIcons}>Mais</Text>
                    </View>
                    <Text style={styles.text}>Richard é um professor universitário que é diagnosticado com uma doença terminal e sua vida é transformada da noite para o dia. Sentindo-se tão pe...</Text>
                </View>
                <View style={styles.seila}>
                    <View style={styles.imdb} >
                        <Text style={styles.textImdb}> IMDb</Text>

                    </View>
                    <Text style={styles.textImdbTwo}>6,7</Text>
                </View>
                <View style={styles.indicacao}>
                    <Text style={styles.textTwo}>2019    90   min</Text>
                    <View style={styles.dezesseis}>
                        <Text style={styles.dezesseisText}>16</Text>
                    </View>
                    <Avatar.Icon
                        size={40}
                        color={'gray'}
                        style={styles.comment}
                        icon="comment-processing" />
                </View>
                <Text style={styles.textThree}>Idiomas: Áudio (3), Legendas (3) </Text>

                <View style={styles.opcoes}>
                    <View style={styles.opcao1}>
                        <Text style={styles.textOpcao1}>Relacionado</Text>
                    </View>
                    <View style={styles.opcao2}>
                        <Text style={styles.textOpcao2}>Mais detalhes</Text>
                    </View>
                </View>
                <View style={styles.tabelas}>
                    <Text style={styles.textTabelaTop}>Gênero</Text>
                    <Text style={styles.textTabelaBotton}>Comédia, Drama</Text>
                </View>
                <View style={styles.tabelas}>
                    <Text style={styles.textTabelaTop}>Diretores</Text>
                    <Text style={styles.textTabelaBotton}>Wayne Roberts</Text>
                </View>
                <View style={styles.tabelas}>
                    <Text style={styles.textTabelaTop}>Atores principais</Text>
                    <Text style={styles.textTabelaBotton}>Johnny Depp, Rosemarie DeWitt, Odessa Young</Text>
                </View>
                <View style={styles.tabelas}>
                    <Text style={styles.textTabelaTop}>Atores coadjuvantes</Text>
                    <Text style={styles.textTabelaBotton}>Danny Huston, Zoey Deutch</Text>
                </View>
                <View style={styles.tabelas}>
                    <Text style={styles.textTabelaTop}>Estúdios</Text>
                    <Text style={styles.textTabelaBotton}>Signature Entertainment</Text>
                </View>
                <View style={styles.tabelas}>
                    <Text style={styles.textTabelaTop}>Classificação etária</Text>
                    <Text style={styles.textTabelaBotton}>16</Text>
                </View>
                <View style={styles.tabelas}>
                    <Text style={styles.textTabelaTop}>Classificação do conteúdo</Text>
                    <Text style={styles.textTabelaBotton}>drogas, conteúdo sexual, linguagem imprópria</Text>
                </View>
                <Text style={styles.textFour}>Avaliações de clientes</Text>
                <Text style={styles.textFive}>Não encontramos avaliações de clientes.</Text>
                <View style={styles.final}></View>
            </ScrollView>
        </View>



    )
}