# Repositório de Projetos Java - Curso de Desenvolvimento Fullstack

Este repositório faz parte do curso de desenvolvimento Fullstack da DIO e contém desafios que abordam diferentes aspectos da programação, como validação de endpoints de API, contagem de métodos HTTP e monitoramento de temperaturas de CPU.

---

## 📂 Estrutura do Repositório

### 📁 Código-fonte

O código está organizado no diretório `src`, com subpacotes para cada desafio:

- **`desafio1`**: Validação de endpoints de API.
- **`desafio2`**: Contagem de métodos HTTP.
- **`desafio3`**: Monitoramento de temperaturas de CPU.

### 📄 Documentação

O diretório `docs` contém arquivos de documentação que explicam o funcionamento e os requisitos de cada desafio:

- [Desafio 1 - Validação de Endpoints](docs/Desafio1.md)
- [Desafio 2 - Contagem de Métodos HTTP](docs/Desafio2.md)
- [Desafio 3 - Monitoramento de Temperaturas](docs/Desafio3.md)

### ⚙️ Configuração do Git

O arquivo `.gitignore` está configurado para ignorar arquivos e diretórios comuns em projetos Java, como:

- Arquivos compilados: `*.class`
- Diretórios de build: `target/`, `build/`
- Configurações de IDEs: `.idea/`, `.vscode`

---

## 🚀 Funcionalidades dos Desafios

### 🟢 Desafio 1 - Validação de Endpoints

Valida se um endpoint segue o formato `/api/{recurso}` utilizando expressões regulares.

- **Exemplo válido**: `/api/users`
- **Exemplo inválido**: `/service/users`

---

### 🟡 Desafio 2 - Contagem de Métodos HTTP

Analisa uma lista de métodos HTTP (como `GET`, `POST`, etc.) e identifica:

- O método mais frequente.
- Uma descrição detalhada do método mais frequente.

---

### 🔴 Desafio 3 - Monitoramento de Temperaturas

Processa uma lista de leituras de temperatura e identifica:

- A maior temperatura registrada.

---
