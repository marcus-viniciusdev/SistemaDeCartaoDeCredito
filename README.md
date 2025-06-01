# 💳 Sistema de Controle de Compras com Cartão de Crédito

Este é um sistema simples em Java que simula um cartão de crédito, permitindo ao usuário realizar compras, controlando o saldo disponível e listando todas as compras realizadas, ordenadas por valor.

---

## 📋 Funcionalidades

✅ Definir o limite do cartão de crédito  
✅ Realizar múltiplas compras até que o saldo se esgote ou o usuário decida sair  
✅ Aceita descrições de compras com espaços (ex.: "Tênis Adidas Preto")  
✅ Exibir todas as compras realizadas, ordenadas pelo valor (do menor ao maior)  
✅ Exibir o saldo restante após as compras  

---

## 🛠️ Tecnologias utilizadas

- **Java**: Linguagem principal
- **Paradigma**: Programação Orientada a Objetos (POO)
- **IDE sugerida**: IntelliJ IDEA, Eclipse ou VSCode com extensão Java

---

## 🗂️ Estrutura do Projeto

```
src
├── br
│ └── com
│ └── alura
│ ├── modelos
│ │ ├── CartaoDeCredito.java
│ │ └── Compra.java
│ └── principais
│ └── Main.java
```

---

## 🔍 Descrição das Classes

### ✅ `Compra`

- Representa uma compra efetuada.
- Contém:
  - **Descrição** da compra
  - **Valor** da compra
- Garante que valores negativos sejam ajustados para zero.

---

### ✅ `CartaoDeCredito`

- Representa o cartão de crédito do usuário.
- Contém:
  - **Limite total**
  - **Saldo disponível**
  - **Lista de compras realizadas**
- Realiza as compras, validando se há saldo suficiente.

---

### ✅ `Main`

- Classe principal com o método `main()`.
- Responsável pela interação com o usuário:
  - Definir limite
  - Realizar compras
  - Exibir as compras e saldo final
- **Agora aceita descrições de compras com espaços** graças ao uso de `scanner.nextLine()`.

---

## ▶️ Como Executar

1. **Clone ou baixe** este repositório.
2. Abra o projeto em sua IDE Java favorita.
3. Compile todas as classes.
4. Execute a classe `Main`.

---

## 🖥️ Exemplo de execução:

```
Digite o limite do cartão: 1000
Digite a descrição da compra: Tênis Adidas Preto
Digite o valor da compra: 299.99
Compra realizada!

Digite 0 para sair ou 1 para continuar comprando: 1
Próxima Compra!

Digite a descrição da compra: Livro de Java
Digite o valor da compra: 150.50
Compra realizada!

Digite 0 para sair ou 1 para continuar comprando: 0
Saindo!

COMPRAS REALIZADAS:

Livro de Java - R$150.50
Tênis Adidas Preto - R$299.99

Saldo do cartão: R$549.51
```

---

## ⚠️ Observações

- O programa não aceita valores negativos para compras ou limite.
- Não há tratamento de exceções para entradas inválidas (por exemplo: letras quando se espera números).

---

## 🚀 Melhorias futuras

- Tratamento de exceções para entradas inválidas.
- Relatório do total gasto.

---

## 🤝 Contribuição

Sinta-se à vontade para sugerir melhorias ou contribuir com o projeto!
* Contribuidores: [Marcus Vinicius](https://github.com/marcus-viniciusdev)

---

## 📄 Licença

Este projeto é de uso educacional e está disponível para livre estudo e modificação.
