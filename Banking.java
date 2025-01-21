import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Banking implements ActionListener {
    private JFrame mainFrame;
    private JTextField inputField;
    private JTextField nameField;
    private JTextField branchField;
    private JTextArea balanceArea;
    private HashMap<String, Integer> balances;

    public Banking() {
        mainFrame = new JFrame("Simple Bank Application");
        mainFrame.setVisible(true);
        mainFrame.setSize(400, 400);
        mainFrame.setFont(new Font("Arial", Font.BOLD, 18));
        mainFrame.setLayout(new GridLayout(4, 2));

        nameField = new JTextField(10);
        nameField.setBorder(BorderFactory.createTitledBorder("Enter your name"));
        branchField = new JTextField(10);
        branchField.setBorder(BorderFactory.createTitledBorder("Branch name"));
        inputField = new JTextField(10);
        inputField.setBorder(BorderFactory.createTitledBorder("Enter Amount"));
        balanceArea = new JTextArea(10, 20);
        balanceArea.setBorder(BorderFactory.createTitledBorder("List of Users"));
        balances = new HashMap<>();

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");

        

        mainFrame.add(nameField);
        mainFrame.add(branchField);
        mainFrame.add(inputField);
        mainFrame.add(depositButton);
        mainFrame.add(withdrawButton);
        mainFrame.add(new JScrollPane(balanceArea));

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String personName = nameField.getText();
        String bankBranch = branchField.getText();
        try {
            int amount = Integer.parseInt(inputField.getText());

            if (!balances.containsKey(personName)) {
                balances.put(personName, 0);
            }

            if (e.getActionCommand().equals("Deposit")) {
                balances.put(personName, balances.get(personName) + amount);
                JOptionPane.showMessageDialog(mainFrame, "Deposit successful!");
            } else {
                balances.put(personName, balances.get(personName) - amount);
                JOptionPane.showMessageDialog(mainFrame, "Withdrawal successful!");
            }

            updateBalanceArea();
            inputField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(mainFrame, "Please enter a valid amount.");
        }
    }

    private void updateBalanceArea() {
        StringBuilder balanceText = new StringBuilder();
        for (Map.Entry<String, Integer> entry : balances.entrySet()) {
            balanceText.append("User: ").append(entry.getKey()).append(" - Balance: ").append(entry.getValue()).append("\n");
        }
        balanceArea.setText(balanceText.toString());
    }

    public static void main(String[] args) {
        new Banking();
    }
}