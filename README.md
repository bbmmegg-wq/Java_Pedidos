#  Sistema de Pedidos em Java

Este projeto implementa um sistema de pedidos utilizando conceitos fundamentais de Programação Orientada a Objetos (POO).  
Ele simula o cadastro de um cliente, itens de um pedido e gera um resumo com totalização dos valores.

------------------

##  Funcionalidades:
- Cadastro de cliente (nome, email, data de nascimento)
- Registro de produtos
- Criação de itens do pedido (quantidade e preço)
- Cálculo de subtotal por item
- Cálculo do total do pedido
- Enumeração de status do pedido (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED)
- Exibição de um resumo completo do pedido

---

##  Conceitos usados
- Classes e Objetos  
- Composição de objetos  
- Enum (`OrderStatus`)  
- Listas (`List<OrderItem>`)  
- Encapsulamento  
- Métodos com responsabilidades claras  
- `new Date()` para capturar o instante do pedido  

-------------------------------

##  Estrutura das Classes

Order
├── moment : Date
├── status : OrderStatus
├── client : Client
├── items : List<OrderItem>
├── addItem()
├── removeItem()
└── total()

------------------------------

OrderItem
├── quantity : Integer
├── price : Double
└── subTotal()

-------------------------------

Product
├── name : String
└── price : Double

--------------------------------
Client
├── name : String
├── email : String
└── birthDate : Date

----------------------------------
OrderStatus (enum)


-----------------------------

##  Tecnologias utilizadas
- **Java 17+**
- **Paradigma Orientado a Objetos**
- IDE: Eclipse 

---

##  Como executar o projeto
1. Clone este repositório- git clone https://github.com/bbmmegg-wq/Java_Pedidos.git
2. Abra o projeto na sua IDE preferida.
3. Rode a classe principal 


<img width="366" height="184" alt="img 1" src="https://github.com/user-attachments/assets/c7a354b0-6c77-45cf-9d5e-93f45b786784" />





<img width="235" height="248" alt="imag 2" src="https://github.com/user-attachments/assets/e00f25c7-1ffc-406b-bb3f-2c851f470efd" />





<img width="401" height="188" alt="img 3" src="https://github.com/user-attachments/assets/470091fa-5711-456f-ac9b-56648babb3b3" />
