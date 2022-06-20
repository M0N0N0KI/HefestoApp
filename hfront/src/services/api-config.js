import axios from 'axios'

export const http = axios.create({
    baseURL: "https://hefestoapi.herokuapp.com",
    auth:
    {
        username : "front",
        password : "HEFESTO2022br$",
    },
})