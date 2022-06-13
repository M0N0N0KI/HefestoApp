import axios, { AxiosInstance } from "axios";
const api : AxiosInstance =  axios.create({
    baseURL : "https://hefestoapi.herokuapp.com/",
    auth: {
    username: "front",
    password: "HEFESTO2022br$"
    },
});