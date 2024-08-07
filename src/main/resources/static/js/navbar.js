document.addEventListener("DOMContentLoaded", function() {
    const hamburgerIcon = document.getElementById("hamburger-icon");
    const menu = document.getElementById("menu");

    hamburgerIcon.addEventListener("click", function() {
        menu.classList.toggle("show");
    });
    const loginButton = document.getElementById("login-button");
    const loginPopup = document.getElementById("login-popup");
    const closeBtn = document.querySelector(".popup-content .close");
    const signUpLink = document.getElementById("sign-up-link");
    const logInLink = document.getElementById("log-in-link");
    const logInLink2 = document.getElementById("log-in-link-2");
    const loginForm = document.getElementById("login-form");
    const signUpOptions = document.getElementById("sign-up-options");
    const signUpForm = document.getElementById("sign-up-form");
    const signUpLoginLink = document.getElementById("sign-up-login-link");
    const continueWithEmail = document.getElementById("continue-with-email");

    loginButton.addEventListener("click", function() {
        loginPopup.style.display = "flex";
        loginForm.style.display = "flex";
        signUpOptions.style.display = "none";
        signUpForm.style.display = "none";
    });

    closeBtn.addEventListener("click", function() {
        loginPopup.style.display = "none";
    });

    window.addEventListener("click", function(event) {
        if (event.target === loginPopup) {
            loginPopup.style.display = "none";
        }
    });

    signUpLink.addEventListener("click", function() {
        loginForm.style.display = "none";
        signUpOptions.style.display = "flex";
        signUpForm.style.display = "none";
    });

    logInLink.addEventListener("click", function() {
        signUpOptions.style.display = "none";
        loginForm.style.display = "flex";
    });

    logInLink2.addEventListener("click", function() {
        signUpForm.style.display = "none";
        loginForm.style.display = "flex";
    });

    signUpLoginLink.addEventListener("click", function() {
        loginPopup.style.display = "flex";
        loginForm.style.display = "flex";
        signUpOptions.style.display = "none";
        signUpForm.style.display = "none";
    });

    continueWithEmail.addEventListener("click", function() {
        signUpOptions.style.display = "none";
        signUpForm.style.display = "flex";
    });
});
