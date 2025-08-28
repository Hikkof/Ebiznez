const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors());
app.use(express.json());

const products = [
  {id: 1, name: "Boots", price: 109.99, description: "gr8 description"},
  {id: 2, name: "The Thing", price: 209.99, description: "a novel"},
  {id: 3, name: "Boot", price: 9.99, description: "a singular boot"},
];

const  payments = []

app.get('/products', (req, res) => {
  res.json(products);
});

app.get('/payments', (req, res) => {
  res.json(payments);
});

app.post('/payments', (req, res) => {
  const { amount } = req.body;

  const payment = {
    amount: Number(amount),
    date: new Date().toISOString()
  };

  payments.push(payment);

  console.log('Payment received:', payment);
  res.status(200).send('Payment booked');
});

const PORT = 8080;
app.listen(PORT, () => {
  console.log(`Server runs on http://localhost:${PORT}`);
});