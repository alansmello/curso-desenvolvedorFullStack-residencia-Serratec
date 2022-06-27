import axios from "axios";

export const API =  axios.create({
    baseURL:"https://api.guthub.com",
    headers:{
        Authorization:""
    }
});

