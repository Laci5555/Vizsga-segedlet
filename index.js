import express from "express";
import cors from "cors"
import mysql from "mysql2/promise"

const app = express();
app.use(express.json())
app.use(cors())

let con = await mysql.createConnection({
    host: "localhost",
    port: 3306,
    database: "adatbazis",
    user: "root",
    password: ""
});

function /*név*/ (req,res){
    let {} = req./*params/body*/
    let sql = ""
    try {
        const [ json ] = await con.query(sql, [/*paraméterek*/]); 
    } catch (err) {
        res.status(/*kód*/).send({error:err})
    }
}

app.get("/", (req,res)=>res.send(""));
app.get("/", );
app.get("/", );


app.listen(/*port */, err =>{
    console.log(err ? err : "Server on :"/*port*/);
})