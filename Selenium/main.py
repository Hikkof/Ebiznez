from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions


def root_tests():
    driver = webdriver.Chrome()

    driver.get("http://localhost:8000")

    header = driver.find_element(By.TAG_NAME, "h2")
    assert header.text == "Products", "Wrong header"

    products = WebDriverWait(driver, 10).until(
        expected_conditions.presence_of_all_elements_located((By.TAG_NAME, "li"))
    )
    assert len(products) > 0, "No products found"

    element = driver.find_element(By.ID, "1")
    assert "Boots" in element.text, "Incorrect entry"
    assert "109.99" in element.text, "Incorrect entry"
    assert "gr8 description" in element.text, "Incorrect entry"

    element = driver.find_element(By.ID, "2")
    assert "The Thing" in element.text, "Incorrect entry"
    assert "209.99" in element.text, "Incorrect entry"
    assert "a novel" in element.text, "Incorrect entry"

    element = driver.find_element(By.ID, "3")
    assert "Boot" in element.text, "Incorrect entry"
    assert "9.99" in element.text, "Incorrect entry"
    assert "a singular boot" in element.text, "Incorrect entry"

    driver.quit()


def payment_tests():
    driver = webdriver.Chrome()

    driver.get("http://localhost:8000")

    amount_input = driver.find_element(By.CSS_SELECTOR, "input[placeholder='amount']")
    amount_input.send_keys("100")
    assert amount_input.get_attribute('value') == "100", "Wrong number"

    pay_button = driver.find_element(By.ID, "pay")
    pay_button.click()

    WebDriverWait(driver, 10).until(
        expected_conditions.presence_of_all_elements_located((By.CSS_SELECTOR, "input[placeholder='amount']"))
    )

    amount_input = driver.find_element(By.CSS_SELECTOR, "input[placeholder='amount']")
    amount_input.send_keys("sU1zWDvy9jnKcx9aSd")
    assert amount_input.get_attribute('value') == "199", "Wrong number"

    pay_button = driver.find_element(By.ID, "pay")
    pay_button.click()


def payments_tests():
    driver = webdriver.Chrome()

    driver.get("http://localhost:8000/payments")

    element = driver.find_element(By.XPATH, "//pre")
    assert "100" in element.text, "Incorrect entry"
    assert "199" in element.text, "Incorrect entry"

    driver.quit()


def products_tests():
    driver = webdriver.Chrome()

    driver.get("http://localhost:8000/products")

    element = driver.find_element(By.XPATH, "//pre")
    assert "Boots" in element.text, "Incorrect entry"
    assert "109.99" in element.text, "Incorrect entry"
    assert "gr8 description" in element.text, "Incorrect entry"

    assert "The Thing" in element.text, "Incorrect entry"
    assert "209.99" in element.text, "Incorrect entry"
    assert "a novel" in element.text, "Incorrect entry"

    assert "Boot" in element.text, "Incorrect entry"
    assert "9.99" in element.text, "Incorrect entry"
    assert "a singular boot" in element.text, "Incorrect entry"

    driver.quit()


root_tests()
payment_tests()
payments_tests()
products_tests()
