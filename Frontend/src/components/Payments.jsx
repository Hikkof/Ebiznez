import { useState } from 'react';
import axios from 'axios';

export function Payments() {
    const [amount, setAmount] = useState('');

    const handlePayment = async () => {
        try {
            await axios.post('http://localhost:8000/payments');
        } catch (error) {
            console.error(error);
        }
    };

    return (
        <div>
            <h2>Payments</h2>
            <form onSubmit={handlePayment}>
                <div>
                    <input
                        type="number"
                        placeholder="amount"
                        value={amount}
                        onChange={(e) => setAmount(e.target.value)}
                        required
                    />
                    <button type="submit">Pay</button>
                </div>
            </form>
        </div>
    );
}