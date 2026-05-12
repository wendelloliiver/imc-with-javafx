# 🏥 Calculadora de IMC com JavaFX

<div align="center">

![Java](https://img.shields.io/badge/Java-11-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-13-4B8BBE?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.6+-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

Uma aplicação desktop moderna e intuitiva para calcular o **Índice de Massa Corporal (IMC)** com interface gráfica desenvolvida em JavaFX.

[Características](#características) • [Instalação](#instalação) • [Como Usar](#como-usar) • [Estrutura do Projeto](#estrutura-do-projeto) • [Tecnologias](#tecnologias)

</div>

---

## 📋 Sobre o Projeto

Este é um projeto educacional desenvolvido de forma **autodidática** para praticar e consolidar conhecimentos em **Java Desktop** com **JavaFX**. A aplicação permite calcular o IMC de forma prática e rápida através de uma interface gráfica amigável.

### ✨ O que é IMC?

O **Índice de Massa Corporal (IMC)** é um indicador que avalia a relação entre o peso e a altura de uma pessoa. Ele é calculado através da fórmula:

```
IMC = Peso (kg) / Altura² (m²)
```

**Classificação do IMC:**
- **< 18,5**: Abaixo do peso
- **18,5 - 24,9**: Peso normal
- **25,0 - 29,9**: Sobrepeso
- **≥ 30,0**: Obesidade

---

## ✨ Características

✅ **Interface Intuitiva** - Interface gráfica moderna e fácil de usar  
✅ **Cálculo Rápido** - Calcula o IMC instantaneamente  
✅ **Tratamento de Erros** - Validação de entrada de dados  
✅ **Suporte a Vírgula** - Aceita tanto ponto quanto vírgula como separador decimal  
✅ **Resultado Formatado** - Mostra o resultado com 2 casas decimais  
✅ **Cross-Platform** - Funciona em Windows, macOS e Linux  

---

## 🚀 Instalação

### Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- **Java JDK 11+** - [Download aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven 3.6+** - [Download aqui](https://maven.apache.org/download.cgi)
- **Git** - [Download aqui](https://git-scm.com/)

### Passos para Instalação

1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/imc-with-javafx.git
cd imc-with-javafx
```

2. **Compile o projeto:**
```bash
mvn clean compile
```

3. **Execute a aplicação:**
```bash
mvn clean javafx:run
```

---

## 📖 Como Usar

1. **Abra a aplicação** executando o comando acima
2. **Insira o Peso** no primeiro campo em quilogramas (kg)
3. **Insira a Altura** no segundo campo em metros (m)
   - Exemplo: 1.75 para 1 metro e 75 centímetros
4. **Clique no botão** "Calcular IMC"
5. **Visualize o resultado** na janela de resultado que aparecerá

### 📝 Exemplo de Uso

```
Peso: 75 kg
Altura: 1.80 m
Resultado: Seu IMC é 23.15
```

---

## 🗂️ Estrutura do Projeto

```
imc-with-javafx/
├── 📄 pom.xml                          # Configurações Maven e dependências
├── 📄 README.md                        # Este arquivo
├── 📂 src/
│   ├── 📂 main/
│   │   ├── 📂 java/
│   │   │   ├── 📄 module-info.java    # Configuração de módulos Java 9+
│   │   │   └── 📂 br/com/oliverdev/
│   │   │       ├── 📄 IMC.java        # Classe principal (ponto de entrada)
│   │   │       └── 📄 ImcController.java # Controller FXML (lógica de negócio)
│   │   └── 📂 resources/
│   │       └── 📂 br/com/oliverdev/
│   │           └── 📄 imc.fxml        # Arquivo FXML (interface gráfica)
│   └── 📂 test/                       # Testes (quando implementados)
└── 📂 target/                          # Arquivos compilados

```

### 📝 Descrição dos Arquivos Principais

| Arquivo | Descrição |
|---------|-----------|
| **IMC.java** | Classe principal que estende `Application` e inicializa a janela da aplicação |
| **ImcController.java** | Controller que contém a lógica de cálculo do IMC e tratamento de eventos |
| **imc.fxml** | Arquivo XML que define a interface gráfica (layout, buttons, textfields) |
| **module-info.java** | Configuração de módulos para Java 9+ |

---

## 🛠️ Tecnologias Utilizadas

### Backend
- **Java 11** - Linguagem de programação
- **JavaFX 13** - Framework para interface gráfica
- **Maven** - Gerenciador de dependências e build

### Dependências Principais
```xml
<!-- JavaFX Controls -->
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-controls</artifactId>
    <version>13</version>
</dependency>

<!-- JavaFX FXML -->
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-fxml</artifactId>
    <version>13</version>
</dependency>
```

---

## 💻 Arquitetura da Aplicação

```
┌─────────────────────────────────────┐
│      IMC (Main Application)         │
│   - Inicializa a janela principal   │
│   - Carrega o arquivo FXML          │
└────────────────┬────────────────────┘
                 │
                 ▼
┌─────────────────────────────────────┐
│    ImcController                    │
│   - Trata eventos de botões         │
│   - Valida entrada do usuário       │
│   - Calcula o IMC                   │
│   - Exibe resultados                │
└────────────────┬────────────────────┘
                 │
                 ▼
┌─────────────────────────────────────┐
│    imc.fxml (Interface Gráfica)     │
│   - TextField para peso             │
│   - TextField para altura           │
│   - Button para calcular            │
│   - Labels informativos             │
└─────────────────────────────────────┘
```

---

## 🎯 Funcionalidades Implementadas

✅ **Cálculo de IMC**
- Realiza o cálculo correto da fórmula IMC = peso / altura²

✅ **Tratamento de Erros**
- Valida se os valores são números válidos
- Valida se os valores são maiores que zero
- Exibe mensagens de erro clara ao usuário

✅ **Flexibilidade de Entrada**
- Aceita tanto ponto (.) quanto vírgula (,) como separador decimal

✅ **Interface Responsiva**
- Layout centralizado e bem organizado
- Fonte clara e legível
- Botão com ação bem definida

---

## 🚀 Possíveis Melhorias Futuras

- [ ] Histórico de cálculos realizados
- [ ] Gráfico de evolução do IMC
- [ ] Temas visuais (claro/escuro)
- [ ] Testes unitários
- [ ] Suporte a múltiplos idiomas
- [ ] Cálculo de IMC ideal baseado em altura
- [ ] Exportação de resultados em PDF
- [ ] Integração com banco de dados para salvar histórico

---

## 📊 Como Contribuir

Contribuições são bem-vindas! Se você encontrou um bug ou tem sugestões de melhorias, sinta-se livre para:

1. **Fazer um Fork** do projeto
2. **Criar uma Branch** para sua feature (`git checkout -b feature/MinhaFeature`)
3. **Commit suas mudanças** (`git commit -m 'Adiciona MinhaFeature'`)
4. **Push para a Branch** (`git push origin feature/MinhaFeature`)
5. **Abrir um Pull Request**

---

## 📚 Aprendizados e Conceitos Praticados

Este projeto foi desenvolvido para praticar e consolidar conhecimentos em:

- ✅ **Orientação a Objetos** - Classes, encapsulamento, herança
- ✅ **JavaFX** - Criação de interfaces gráficas
- ✅ **FXML** - Markup language para UI
- ✅ **Maven** - Gerenciamento de projetos Java
- ✅ **Tratamento de Exceções** - Validação e tratamento de erros
- ✅ **Event Handling** - Resposta a eventos do usuário
- ✅ **Formatação de Dados** - Conversão e formatação de números

---

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

## 👨‍💻 Autor

**Oliver Dev**

- 📧 Email: seu-email@exemplo.com
- 🔗 GitHub: [@seu-usuario](https://github.com/seu-usuario)
- 💼 LinkedIn: [seu-linkedin](https://linkedin.com/in/seu-linkedin)

---

## 📞 Suporte

Se você tiver dúvidas ou problemas, entre em contato através de:

- **Issues no GitHub** - Abra uma issue com sua dúvida
- **Discussões** - Participe das discussões do projeto

---

<div align="center">

⭐ Se este projeto foi útil para você, considere dar uma star! ⭐

Desenvolvido com ❤️ como projeto de aprendizado

</div>
