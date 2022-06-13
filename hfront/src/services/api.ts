import axios, { AxiosInstance } from "axios";
const api : AxiosInstance =  axios.create({
    baseURL : "https://hefestoapi.herokuapp.com/",
    auth: {
    username: "FRONT",
    password: "HEFESTO2022br$"
    },
});