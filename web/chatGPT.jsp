<%-- 
    Document   : chatGPT
    Created on : Sep 29, 2023, 12:47:58 PM
    Author     : RAJ SHAH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/remixicon@3.5.0/fonts/remixicon.css" rel="stylesheet">
    <!-- Google Fonts Link For Icons -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <title>chatGPT</title>
         <%@include file="allcontent/allcss.jsp" %>
        <style>
            /* Import Google font - Poppins */
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap');
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}
:root {
  --text-color: #FFFFFF;
  --icon-color: #ACACBE;
  --icon-hover-bg: #5b5e71;
  --placeholder-color: #dcdcdc;
  --outgoing-chat-bg: #343541;
  --incoming-chat-bg: #444654;
  --outgoing-chat-border: #343541;
  --incoming-chat-border: #444654;
}
.light-mode {
  --text-color: #343541;
  --icon-color: #a9a9bc;
  --icon-hover-bg: #f1f1f3;
  --placeholder-color: #6c6c6c;
  --outgoing-chat-bg: #FFFFFF;
  --incoming-chat-bg: #F7F7F8;
  --outgoing-chat-border: #FFFFFF;
  --incoming-chat-border: #D9D9E3;
}
body {
  background: var(--outgoing-chat-bg);
}

/* Chats container styling */
.chat-container {
  overflow-y: auto;
  max-height: 100vh;
  padding-bottom: 150px;
}
:where(.chat-container, textarea)::-webkit-scrollbar {
  width: 6px;
}
:where(.chat-container, textarea)::-webkit-scrollbar-track {
  background: var(--incoming-chat-bg);
  border-radius: 25px;
}
:where(.chat-container, textarea)::-webkit-scrollbar-thumb {
  background: var(--icon-color);
  border-radius: 25px;
}
.default-text {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  height: 70vh;
  padding: 0 10px;
  text-align: center;
  color: var(--text-color);
}
.default-text h1 {
  font-size: 3.3rem;
}
.default-text p {
  margin-top: 10px;
  font-size: 1.1rem;
}
.chat-container .chat {
  padding: 25px 10px;
  display: flex;
  justify-content: center;
  color: var(--text-color);
}
.chat-container .chat.outgoing {
  background: var(--outgoing-chat-bg);
  border: 1px solid var(--outgoing-chat-border);
}
.chat-container .chat.incoming {
  background: var(--incoming-chat-bg);
  border: 1px solid var(--incoming-chat-border);
}
.chat .chat-content {
  display: flex;
  max-width: 1200px;
  width: 100%;
  align-items: flex-start;
  justify-content: space-between;
}
span.material-symbols-rounded {
  user-select: none;
  cursor: pointer;
}
.chat .chat-content span {
  cursor: pointer;
  font-size: 1.3rem;
  color: var(--icon-color);
  visibility: hidden;
}
.chat:hover .chat-content:not(:has(.typing-animation), :has(.error)) span {
  visibility: visible;
}
.chat .chat-details {
  display: flex;
  align-items: center;
}
.chat .chat-details img {
  width: 35px;
  height: 35px;
  align-self: flex-start;
  object-fit: cover;
  border-radius: 2px;
}
.chat .chat-details p {
  white-space: pre-wrap;
  font-size: 1.05rem;
  padding: 0 50px 0 25px;
  color: var(--text-color);
  word-break: break-word;
}
.chat .chat-details p.error {
  color: #e55865;
}
.chat .typing-animation {
  padding-left: 25px;
  display: inline-flex;
}
.typing-animation .typing-dot {
  height: 7px;
  width: 7px;
  border-radius: 50%;
  margin: 0 3px;
  opacity: 0.7;
  background: var(--text-color);
  animation: animateDots 1.5s var(--delay) ease-in-out infinite;
}
.typing-animation .typing-dot:first-child {
  margin-left: 0;
}
@keyframes animateDots {
  0%,44% {
    transform: translateY(0px);
  }
  28% {
    opacity: 0.4;
    transform: translateY(-6px);
  }
  44% {
    opacity: 0.2;
  }
}

/* Typing container styling */
.typing-container {
  position: fixed;
  bottom: 0;
  width: 100%;
  display: flex;
  padding: 20px 10px;
  justify-content: center;
  background: var(--outgoing-chat-bg);
  border-top: 1px solid var(--incoming-chat-border);
}
.typing-container .typing-content {
  display: flex;
  max-width: 950px;
  width: 100%;
  align-items: flex-end;
}
.typing-container .typing-textarea {
  width: 100%;
  display: flex;
  position: relative;
}
.typing-textarea textarea {
  resize: none;
  height: 55px;
  width: 100%;
  border: none;
  padding: 15px 45px 15px 20px;
  color: var(--text-color);
  font-size: 1rem;
  border-radius: 4px;
  max-height: 250px;
  overflow-y: auto;
  background: var(--incoming-chat-bg);
  outline: 1px solid var(--incoming-chat-border);
}
.typing-textarea textarea::placeholder {
  color: var(--placeholder-color);
}
.typing-content span {
  width: 55px;
  height: 55px;
  display: flex;
  border-radius: 4px;
  font-size: 1.35rem;
  align-items: center;
  justify-content: center;
  color: var(--icon-color);
}
.typing-textarea span {
  position: absolute;
  right: 0;
  bottom: 0;
  visibility: hidden;
}
.typing-textarea textarea:valid ~ span {
  visibility: visible;
}
.typing-controls {
  display: flex;
}
.typing-controls span {
  margin-left: 7px;
  font-size: 1.4rem;
  background: var(--incoming-chat-bg);
  outline: 1px solid var(--incoming-chat-border);
}
.typing-controls span:hover {
  background: var(--icon-hover-bg);
}

/* Reponsive Media Query */
@media screen and (max-width: 600px) {
  .default-text h1 {
    font-size: 2.3rem;
  }
  :where(.default-text p, textarea, .chat p) {
    font-size: 0.95rem!important;
  }
  .chat-container .chat {
    padding: 20px 10px;
  }
  .chat-container .chat img {
    height: 32px;
    width: 32px;
  }
  .chat-container .chat p {
    padding: 0 20px;
  }
  .chat .chat-content:not(:has(.typing-animation), :has(.error)
  ) span {
    visibility: visible;
  }
  .typing-container {
    padding: 15px 10px;
  }
  .typing-textarea textarea {
    height: 45px;
    padding: 10px 40px 10px 10px;
  }
  .typing-content span {
    height: 45px;
    width: 45px;
    margin-left: 5px;
  }
  span.material-symbols-rounded {
    font-size: 1.25rem!important;
  }
}
        </style>
       
    </head>
    <body>
    <%@include file="allcontent/navbar.jsp"%>
        <!-- Chats container -->
    <div class="chat-container"></div>
    
    <!-- Typing container -->
    <div class="typing-container">
      <div class="typing-content">
        <div class="typing-textarea">
          <textarea id="chat-input" spellcheck="false" placeholder="Enter a prompt here" required></textarea>
          <span id="send-btn" class="material-symbols-rounded">send</span>
        </div>
        <div class="typing-controls">
          <span id="theme-btn" class="material-symbols-rounded">light_mode</span>
          <span id="delete-btn" class="material-symbols-rounded">delete</span>
          <span id="mic-btn" ><i class="ri-mic-fill"></i></span>
      </div>
    </div>
        
        <script>
             const chatInput = document.querySelector("#chat-input");
const sendButton = document.querySelector("#send-btn");
const chatContainer = document.querySelector(".chat-container");
const themeButton = document.querySelector("#theme-btn");
const deleteButton = document.querySelector("#delete-btn");
const micButton = document.querySelector("#mic-btn");

let userText = null;
const API_KEY = "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"; // Paste your API key here

const loadDataFromLocalstorage = () => {
    // Load saved chats and theme from local storage and apply/add on the page
    const themeColor = localStorage.getItem("themeColor");

    document.body.classList.toggle("light-mode", themeColor === "light_mode");
    themeButton.innerText = document.body.classList.contains("light-mode") ? "dark_mode" : "light_mode";

    const defaultText = `<div class="default-text">
                            <h1>ChatGPT Clone</h1>
                            <p>Start a conversation and explore the power of AI.<br> Your chat history will be displayed here.</p>
                        </div>`

    chatContainer.innerHTML = localStorage.getItem("all-chats") || defaultText;
    chatContainer.scrollTo(0, chatContainer.scrollHeight); // Scroll to bottom of the chat container
}

const createChatElement = (content, className) => {
    // Create new div and apply chat, specified class and set html content of div
    const chatDiv = document.createElement("div");
    chatDiv.classList.add("chat", className);
    chatDiv.innerHTML = content;
    return chatDiv; // Return the created chat div
}

const getChatResponse = async (incomingChatDiv) => {
    // const API_URL = "https://api.openai.com/v1/chat/completions";
    const API_URL = "https://api.openai.com/v1/chat/completions";

    const pElement = document.createElement("p");

    // Define the properties and data for the API request
    const requestOptions = {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
            "Authorization": `Bearer ${API_KEY}`
        },
        body: JSON.stringify({
            model: "gpt-3.5-turbo",
            messages: [
                {
                    role: "system",
                    content: "You are a helpful assistant."
                },
                {
                    role: "user",
                    content: userText
                }
            ]
        })
    }

    // Send POST request to API, get response and set the reponse as paragraph element text
    try {
        const response = await (await fetch(API_URL, requestOptions)).json();
        const message = response.choices[0].message.content;
        pElement.textContent = message.trim();
    } catch (error) { // Add error class to the paragraph element and set error text
        pElement.classList.add("error");
        pElement.textContent = "Oops! Something went wrong while retrieving the response. Please try again.";
    }

    // Remove the typing animation, append the paragraph element and save the chats to local storage
    incomingChatDiv.querySelector(".typing-animation").remove();
    incomingChatDiv.querySelector(".chat-details").appendChild(pElement);
    localStorage.setItem("all-chats", chatContainer.innerHTML);
    chatContainer.scrollTo(0, chatContainer.scrollHeight);
}

const showTypingAnimation = () => {
    // Display the typing animation and call the getChatResponse function
    const html = `<div class="chat-content">
                    <div class="chat-details">
                        <img src="images/chatbot.jpg" alt="chatbot-img">
                        <div class="typing-animation">
                            <div class="typing-dot" style="--delay: 0.2s"></div>
                            <div class="typing-dot" style="--delay: 0.3s"></div>
                            <div class="typing-dot" style="--delay: 0.4s"></div>
                        </div>
                    </div>
                    <span onclick="copyResponse(this)" class="material-symbols-rounded">content_copy</span>
                </div>`;
    // Create an incoming chat div with typing animation and append it to chat container
    const incomingChatDiv = createChatElement(html, "incoming");
    chatContainer.appendChild(incomingChatDiv);
    chatContainer.scrollTo(0, chatContainer.scrollHeight);
    getChatResponse(incomingChatDiv);
}

const handleOutgoingChat = () => {
    userText = chatInput.value.trim(); // Get chatInput value and remove extra spaces
    if(!userText) return; // If chatInput is empty return from here

    // Clear the input field and reset its height
    chatInput.value = "";
    chatInput.style.height = `${initialInputHeight}px`;

    const html = `<div class="chat-content">
                    <div class="chat-details">
                        <img src="images/user.jpg" alt="user-img">
                        <p>${userText}</p>
                    </div>
                </div>`;

    // Create an outgoing chat div with user's message and append it to chat container
    const outgoingChatDiv = createChatElement(html, "outgoing");
    chatContainer.querySelector(".default-text")?.remove();
    chatContainer.appendChild(outgoingChatDiv);
    chatContainer.scrollTo(0, chatContainer.scrollHeight);
    setTimeout(showTypingAnimation, 500);
}
micButton.addEventListener("click", () =>{
    const startButton = document.getElementById('startButton');
    const resultText = document.getElementById('resultText');
    const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;

    if (SpeechRecognition) {
      const recognition = new SpeechRecognition();

      recognition.lang = 'en-IN'; // Set the language to English (India)
      recognition.start();
      recognition.onstart = () => {
        micButton.style.background ="red"
        // startButton.textContent = 'Listening...';
      };

      recognition.onresult = (event) => {
        const transcript = event.results[0][0].transcript;
        chatInput.textContent = transcript;
      };

      recognition.onend = () => {
        micButton.style.background ="#5B5E71"
        // startButton.textContent = 'Start Listening';
      };

    //   startButton.addEventListener('click', () => {
        
    //   });
    } else {
      resultText.textContent = "Speech recognition is not supported by this browser.";
    }
})

deleteButton.addEventListener("click", () => {
    // Remove the chats from local storage and call loadDataFromLocalstorage function
    if(confirm("Are you sure you want to delete all the chats?")) {
        localStorage.removeItem("all-chats");
        loadDataFromLocalstorage();
    }
});

themeButton.addEventListener("click", () => {
    // Toggle body's class for the theme mode and save the updated theme to the local storage 
    document.body.classList.toggle("light-mode");
    localStorage.setItem("themeColor", themeButton.innerText);
    themeButton.innerText = document.body.classList.contains("light-mode") ? "dark_mode" : "light_mode";
});

const initialInputHeight = chatInput.scrollHeight;

chatInput.addEventListener("input", () => {   
    // Adjust the height of the input field dynamically based on its content
    chatInput.style.height =  `${initialInputHeight}px`;
    chatInput.style.height = `${chatInput.scrollHeight}px`;
});

chatInput.addEventListener("keydown", (e) => {
    // If the Enter key is pressed without Shift and the window width is larger 
    // than 800 pixels, handle the outgoing chat
    if (e.key === "Enter" && !e.shiftKey && window.innerWidth > 800) {
        e.preventDefault();
        handleOutgoingChat();
    }
});

loadDataFromLocalstorage();
sendButton.addEventListener("click", handleOutgoingChat);
            
</script>
    </body>
</html>
