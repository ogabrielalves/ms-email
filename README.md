# Sobre 💾

### O projeto trata-se de um Microservice para envio de email utilizando Spring Email e o servidor SMTP do Gmail.
<br>
# Rota de Envio de E-mail 📧

> ### Método POST 🕊️
#### Enviar um e-mail `.../sending-email`

```json
{
    "ownerRef": "string",
    "emailFrom": "string",
    "emailTo": "string",
    "subject": "string",
    "text": "string"
}
```
