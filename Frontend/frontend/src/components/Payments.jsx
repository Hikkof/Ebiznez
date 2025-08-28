import { useState } from 'react';
import axios from 'axios';

export function Payments() {
    const [amount, setAmount] = useState('');

    const handlePayment = async () => {
        const numericAmount = Number(amount);

        if (isNaN(numericAmount)) {
            console.error('Invalid amount');
            return;
        }

        try {
            await axios.post('http://localhost:8000/payments', {
                amount: numericAmount,
            });
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
                        min="0.01"
                        step="0.01"
                        placeholder="amount"
                        value={amount}
                        onChange={(e) => setAmount(e.target.value)}
                        required
                    />
                    <button id="pay" type="submit">Pay</button>
                </div>
            </form>
        </div>
    );
}
