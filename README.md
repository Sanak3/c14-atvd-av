# Calculadora Científica de Console

![Badge de Status do Projeto](https://img.shields.io/badge/status-conclu%C3%ADdo-green)
![Java](https://img.shields.io/badge/Java-24-blue)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)
![JUnit 5](https://img.shields.io/badge/JUnit-5.10.1-brightgreen)

## 📝 Descrição

Este projeto é uma calculadora científica baseada em console, desenvolvida em Java. A aplicação oferece um menu interativo que permite ao usuário escolher entre diversas operações matemáticas,
desde as aritméticas básicas até cálculos trigonométricos e exponenciais.
O projeto foi construído utilizando Maven para gerenciamento de dependências e inclui uma suíte de testes completa com JUnit para garantir que as operações funcionam.


## 🚀 Funcionalidades

A calculadora suporta as seguintes operações:

* **Básicas:**
    * Soma (`+`)
    * Subtração (`-`)
    * Multiplicação (`*`)
    * Divisão (`/`) com tratamento de divisão por zero.
* **Cálculos Avançados:**
    * Raiz Quadrada (`√`) com tratamento para números negativos.
    * Potenciação (`x^y`)
    * Porcentagem (`%`)
* **Trigonometria (com entrada em graus):**
    * Seno (`sin`)
    * Cosseno (`cos`)
    * Tangente (`tan`)


## 🛠️ Tecnologias Utilizadas

* **[Java](https://www.java.com/)**: Linguagem de programação principal do projeto.
* **[Apache Maven](https://maven.apache.org/)**: Ferramenta para gerenciamento de dependências e automação de build do projeto.
* **[JUnit 5](https://junit.org/junit5/)**: Framework para a escrita e execução de testes unitários, garantindo a qualidade e o funcionamento esperado do código.


## ⚙️ Como Executar o Projeto

### Pré-requisitos

Antes de começar, você precisará ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) e o [Apache Maven](https://maven.apache.org/download.cgi) instalados em sua máquina.

### Passos para Execução

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Sanak3/c14-atvd-av.git](https://github.com/Sanak3/c14-atvd-av.git)
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd c14-atvd-av
    ```

3.  **Compile o projeto com o Maven:**
    ```bash
    mvn compile
    ```

4.  **Execute a classe principal (`Main.java`):**
    ```bash
    mvn exec:java -Dexec.mainClass="org.example.Main"
    ```

Após executar o último comando, a calculadora será iniciada no seu terminal e você poderá começar a usar as operações.


## 🧪 Como Rodar os Testes

O projeto conta com uma suíte de testes unitários para validar todas as funcionalidades da calculadora. Para executá-los, utilize o seguinte comando na raiz do projeto:

```bash
mvn test
