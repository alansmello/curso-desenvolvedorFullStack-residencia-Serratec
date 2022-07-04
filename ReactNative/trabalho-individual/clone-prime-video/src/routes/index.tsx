import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";
import { Filme } from "../screens/Filme";
import { Login } from "../screens/Login";

const Stack = createStackNavigator();

export const Routes = ()=>{
    return (
        <NavigationContainer>
            <Stack.Navigator
                screenOptions={{
                    headerShown:false,
                }}
            >
                <Stack.Screen name="Login" component = {Login}/>
                <Stack.Screen name="Filme" component= {Filme} />
            </Stack.Navigator>
        </NavigationContainer>
    )
}